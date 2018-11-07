package vaadincomgr;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {
        Button button = new Button("Hello there",
                e -> Notification.show(bean.getMessage()));
        add(button);
    }

}
