package com.andreitudose;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
public class SimpleItem implements Item {

    Boolean checked = false;

    @NotNull(message="field required")
    @Size(min=5, message="field required")
    String text;

    public SimpleItem() {}

    @Override
    public void check() {
        checked = true;
    }

    @Override
    public void uncheck() {
        checked = false;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Boolean getChecked() {
        return checked;
    }
}
