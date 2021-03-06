//package dsearchDC_so;

public class Sequence implements java.io.Serializable
{
    private String sequenceName;
    private String sequenceBody;
    private int score;
    private String alignment;

    public Sequence()
    {
        sequenceName = new String();
        sequenceBody = new String();
        score        = 0;
        alignment    = "not calculated";
    }

    public Sequence(String name, String body)
    {
        sequenceName = name;
        sequenceBody = body;
        score        = 0;
        alignment    = "not calculated";
    }

    public Sequence(Sequence seq)
    {
        sequenceName = new String(seq.getSequenceName());
        sequenceBody = new String(seq.getSequenceBody());
        score        = new Integer(seq.getSequenceScore());
        alignment    = new String(seq.getSequenceAlignment());
    }

    public String getSequenceName()
    {
        return sequenceName;
    }

    public String getSequenceBody()
    {
        return sequenceBody;
    }

    public int getSequenceScore()
    {
        return score;
    }

    public String getSequenceAlignment()
    {
        return alignment;
    }
    public void setSequenceName(String name)
    {
        sequenceName = name;
    }

    public void setSequenceBody(String body)
    {
        sequenceBody = body;
    }

    public void setSequenceScore(int score)
    {
        this.score = score;
    }

    public void setSequenceAlignment(String alignment)
    {
        this.alignment = new String(alignment);
    }
}
