package ru.job4j.tracker;

import org.junit.Test;

public class ShowallItemsActionTest {
    @Test
    public void allItems() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
    }
}
