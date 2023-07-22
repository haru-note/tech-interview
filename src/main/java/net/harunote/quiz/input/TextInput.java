package net.harunote.quiz.input;

class TextInput {
    static String textInput = "";
    public void add(char c) {
        textInput += c;
    }


    public String getValue() {
        return textInput;
    }
}
