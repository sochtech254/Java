package org.sochtech.innerandabstractclassesandinterfaces.codechallenges;

public interface NodeList
{
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
