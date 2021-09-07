import {LitElement, html} from 'lit-element';
import jsonlint = require("jsonlint");

class HelloWorld extends LitElement {

    connectedCallback() {
        super.connectedCallback();
        console.log("connectedCallback");
        
        let result = jsonlint.parse('{"creative?": false}');
		console.log('Json Parsed');
        console.log(result);
    }

    render() {
        return html`
            <div>
            	<p>Hello Hello</p>
            </div>`;
    }
}

customElements.define('hello-world', HelloWorld);