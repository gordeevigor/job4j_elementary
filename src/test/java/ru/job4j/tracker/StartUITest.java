package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StartUITest {
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC", "Fix iPhone"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        StartUI.createItem(input, tracker);
        Item created1 = tracker.findAll()[1];
        Item expected1 = new Item("Fix iPhone");
        assertThat(created.getName()).isEqualTo(expected.getName());
        assertThat(created1.getName()).isEqualTo(expected1.getName());
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "edited item"};
        Input input = new MockInput(answers);
        StartUI.replaceItem(input, tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        Input input = new MockInput(answers);
        StartUI.deleteItem(input, tracker);
        Item deletedItem = tracker.findById(item.getId());
        Item[] erased = tracker.findAll();
        assertThat(deletedItem).isNull();
        assertThat(erased).isEmpty();
    }
}
