package nipahu.editor;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("hello-world")
@NpmPackage(value = "@axa-ch/input-text", version = "4.3.11")
@JsModule("./jsonlint.js")
@JsModule("./hello-world-nph.ts")
@JsModule("./sapl-mode.js")
@JsModule("./xtext-codemirror.min.js")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "codemirror", version = "5.52.2")
//@NpmPackage(value = "jsonlint", version = "1.6.3")
public class HelloWorld extends LitTemplate {

    /**
     * Creates the hello world template.
     */
    public HelloWorld() {
    }
}
