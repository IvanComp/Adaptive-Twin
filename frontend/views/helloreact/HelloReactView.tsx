import { useEffect, useState } from 'react';
// @ts-ignore
import BpmnModeler from 'bpmn-js/dist/bpmn-modeler.production.min.js';
import 'bpmn-js/dist/assets/diagram-js.css';
import axios from 'axios';
import 'bpmn-js/dist/assets/bpmn-font/css/bpmn.css';


export default function BpmnEditor() {
    const [bpmnModeler, setBpmnModeler] = useState<BpmnModeler | null>(null);

    useEffect(() => {
        const initBpmnModeler = async () => {
            const modeler = new BpmnModeler({
                container: '#bpmn-container',
                keyboard: {
                    bindTo: document
                }
            });

            setBpmnModeler(modeler);
        };

        initBpmnModeler();
    }, []);

    const createNewDiagram = () => {
        bpmnModeler?.createDiagram();
    };

    const saveDiagram = async () => {
        const result = await bpmnModeler?.saveXML({ format: true });

        if (result && result.xml) {
            try {
                // Invia il contenuto del file al backend utilizzando Axios
                await axios.post('/save-diagram', { xml: result.xml });
                console.log('Diagramma salvato nel backend.');
            } catch (error) {
                console.error('Errore durante il salvataggio del diagramma nel backend:', error);
            }
        }
    };

    const deployDiagram = async () => {
        const result = await bpmnModeler?.saveXML({ format: true });

        if (result && result.xml) {
            try {
                await axios.post('/deploy-diagram', { xml: result.xml });
                console.log('Diagramma inviato al backend per il deploy.');
            } catch (error) {
                console.error('Errore durante l\'invio del diagramma al backend:', error);
            }
        }
    };

    return (
        <div>
            <div id="bpmn-container" style={{ height:"600px", border:"solid 0.1px",margin:"15px"}}></div>
            <button style={{margin:"15px"}}onClick={createNewDiagram}>Create New Diagram</button>
            <button style={{margin:"15px"}}onClick={deployDiagram}>Deploy Diagram</button>
            <button style={{margin:"15px"}} onClick={saveDiagram}>Save Diagram</button>
        </div>
    );
}
