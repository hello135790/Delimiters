import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] tokens = {"(", "x + y", ")", " * 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));

        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        Delimiters e = new Delimiters("<q>", "</q>");
        System.out.println(e.getDelimitersList(tokens2));

        String open = "<sup>";
        String close = "</sup>";
        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for (String s:delims) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));

        String[] delims2 = {open, open, open, open};
        for (String s:delims2) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));

        String[] delims3 = {close};
        for (String s:delims3) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));

        String[] delims4 = {open, open, close};
        for (String s:delims4) delimiters.add(s);
        System.out.println(d.isBalanced(delimiters));
    }
}