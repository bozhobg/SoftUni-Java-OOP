package theme04InterfaceAndAbstraction.exercise.p05Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }


    public List<String> getUrls() {
        return urls;
    }


    @Override
    public String call() {
        StringBuilder formatterCalling = new StringBuilder();
//        "Calling... {number}".

        for (String number : numbers) {
            boolean invalidNumber = false;

            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    invalidNumber = true;
                    break;
                }
            }

            if (invalidNumber) {
                formatterCalling.append("Invalid number!");
            } else {
                formatterCalling.append("Calling... " + number);
            }

            formatterCalling.append(System.lineSeparator());
        }

        return formatterCalling.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder formatterBrowsing = new StringBuilder();
//        "Browsing: {site}!"

        for (String url : urls) {
            boolean invalidUrl = false;

            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    invalidUrl = true;
                    break;
                }
            }

            if (invalidUrl) {
                formatterBrowsing.append("Invalid URL!");
            } else {
                formatterBrowsing.append("Browsing: " + url + "!");
            }

            formatterBrowsing.append(System.lineSeparator());
        }

        return formatterBrowsing.toString().trim();
    }
}
