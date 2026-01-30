package org.sochtech.introduction;

public class MultipleClassesInSameFile {
    static void main() {
        IO.println(GenerateMessage.generateMessage());
        IO.println(AnotherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}
