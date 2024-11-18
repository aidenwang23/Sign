public class Sign
{
    private String phrase; 
    private int width;
    private int index;

    public Sign(String a, int b)
    {
        phrase = a;
        width = b;
    }

    public int numberOfLines()
    {
        if(phrase.length() <= width) return 1;
        if(phrase.length()%width > 0) return phrase.length()/width + 1;
        return phrase.length()/width;
    }

    public String getLines()
    {
        String copy = phrase;
        for(int i=0; i<phrase.length(); i++)
            index++;
            copy += phrase.substring(index-1, index);
            if(index%width == 0) copy+=";";
        return copy;
    }
}
