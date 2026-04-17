public class History {
    Stack history, temp;

    public History(int size) {
        this.history = new Stack(size);
        this.temp = new Stack(size);
    }
    public int getNumberOfLinks() { return history.size(); }
    public void removeLast() { history.pop(); }
    public void add(String URL) {
        int freq = -1;
        while (!history.isEmpty()) {
            Link current = (Link) history.peek();
            if (URL.equals(current.getURL())) {
                freq = current.getFrequency() + 1;
                break;
            }
            else temp.push(history.pop());
        }
        while (!temp.isEmpty())
            history.push(temp.pop());
        if (freq == -1)
            history.push(new Link(URL));
        else history.push(new Link(URL, freq));
    }
    public void remove(String date) {
        while (!history.isEmpty()) {
            Link current = (Link) history.peek();
            if (date.equals(current.getDate())) history.pop();
            else temp.push(history.pop());
        }
        while (!temp.isEmpty())
            history.push(temp.pop());
    }
    public String search() {
        Link highest = (Link) history.peek();
        while (!history.isEmpty()) {
            Link current = (Link) history.peek();
            if (current.getFrequency() > highest.getFrequency())
                highest = current;
            temp.push(history.pop());
        }
        while (!temp.isEmpty())
            history.push(temp.pop());
        return highest.getURL();
    }
    @Override
    public String toString() {
        StringBuilder his = new StringBuilder();
        while (!history.isEmpty()) {
            his.append(history.peek()).append("\n");
            temp.push(history.pop());
        }
        while (!temp.isEmpty())
            history.push(temp.pop());
        return his.toString();
    }

    static void main() {
        History his = new History(10);
        his.add("https://youtube.com");
        his.add("https://youtube.com");
        his.add("https://reddit.com");
        IO.println(his.getNumberOfLinks());
        IO.println(his.search());
        IO.println(his);
        his.removeLast();
        IO.println(his);
        his.remove("2025-10-24");
        IO.println(his);
        his.add("https://facebook.com");
        IO.println(his);
    }
}
