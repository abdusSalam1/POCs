package com.ui;

import com.config.AppConfiguration;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Abdus Salam on 9/12/2016.
 */
@PreserveOnRefresh
public class AppUI extends UI {

  private AppConfiguration appConfiguration;

  @Override
  protected void init(VaadinRequest request) {
    VerticalLayout layout = new VerticalLayout();
    layout.addComponent(new Label("hi"));
    setContent(layout);
  }
}
