module net.jorjai.se1gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens net.jorjai.se1gitexercise to javafx.fxml;
    exports net.jorjai.se1gitexercise;
}