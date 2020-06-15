package ru.itis.inbook.models;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "MyScope",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PageData {
    @Getter
    private int count;
    public void onVisit() {
        count++;
    }

}