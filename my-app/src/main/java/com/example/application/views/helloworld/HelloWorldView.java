package com.example.application.views.helloworld;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

import org.vaadin.jchristophe.SortableLayout;

import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

import nipahu.editor.HelloWorld;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    public HelloWorldView() {
    	HelloWorld hello = new HelloWorld();
        add(hello);
        
     // add your layout
        VerticalLayout verticalLayout = new VerticalLayout();
        // add your elements
        for (int i = 0; i < 5; i++) {

            Button button = new Button("btn "+ i);
            button.setId("ID "+ i);
            verticalLayout.add(button);
        }
        // wrap your layout
        SortableLayout sortableLayout = new SortableLayout(verticalLayout);
        
        sortableLayout.addSortableComponentReorderListener(listener -> {
        	// do whatever you want when the order has been changed
            // Here Show a notification with the list of ordered components
            StringBuilder ids = new StringBuilder("components ");
            for (Component sortableLayoutComponent : sortableLayout.getComponents()) {
                if (sortableLayoutComponent.getId().isPresent()) {
                    ids.append(" ").append(sortableLayoutComponent.getId().get());
                }
            }

            Notification.show(ids.toString());
        });
        add(sortableLayout);
    }

}
