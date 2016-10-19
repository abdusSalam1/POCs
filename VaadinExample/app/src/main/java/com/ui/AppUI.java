package com.ui;

import com.service.UserService;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Abdus Salam on 9/12/2016.
 */

@PreserveOnRefresh
public class AppUI extends UI {

    @Autowired
    public UserService userService;

    @Override
    protected void init(VaadinRequest request) {
        userService.getUser();
        VerticalLayout layout = new VerticalLayout();
        layout.addComponent(new Label("hi"));
        setContent(layout);
    }
}
