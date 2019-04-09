/*
    CHC-26Mar2019
        This subclass inherits from the Product class.
        Creates a new object for CompactDisc.
        Includes public set and get methods for private instance of "Artist".
        toString method appends the artist name to the end of the string.
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
	public String toString()
	{
		return super.toString() +
			"Artist:      " + artist + "\n";
	}
}
