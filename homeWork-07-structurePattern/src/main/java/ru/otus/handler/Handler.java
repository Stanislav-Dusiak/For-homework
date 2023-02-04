package ru.otus.handler;

import ru.otus.listener.Listener;
import ru.otus.model.Message;

public interface Handler {
    Message handle(Message msg);

    void addListener(Listener listenerr);
    void removeListener(Listener listener);
}
