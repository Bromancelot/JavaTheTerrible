/*
    CHC-29Mar2019
        Added this class per instruction on Exercise 8-3
        Add getDisplayText method
*/

public class CompactDisc extends Product
{
	private String artist;

	public CompactDisc()
	{
		super();
		artist = "";
		count++;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String getArtist()
        {
		return artist;
	}

        @Override
	public String getDisplayText()
	{
		return super.toString() +
			"Artist:      " + artist + "\n";
	}
}
