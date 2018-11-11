import java.util.*;
import java.util.ArrayList;

/**
 * Class to represent a "playmyList" of songs
 * @author Alkis Stavrinides
 * @version 1.2 - 30/1/12 (Exercise_5 for m19com Lab4)
 */
public class PlayList implements SongList
{
    private ArrayList<Song> myList;
    /**
     * Constructor
     */
    public PlayList()
    {
      myList = new ArrayList<Song>;
    }
    
    /**
     * Get the song at a given position in the myList
     * @param ...
     * @return ...
     */
    public Song get(int i)
    {
        return myList.get(i);
    }
    
   /**
     * Add a given song to the myList
     * @param ...
     * @return ...
     */
    public boolean add(Song song)
    {
        return myList.add(song);
    }
    
	 
    /**
     * Remove a given song from the myList
     * @param ...
     * @return ...
     */
    public boolean remove(Song song)
    {
        return myList.remove(song);
    }
    
	 
    /**
     * Add all songs from another song myList 
     * @param ...
     * @return ...
     */
    public boolean merge(SongList list)
    {
        int size = this.myList.size();
        for(int i = 0; i < list.size(); i++)
            myList.add(list.get(i));
        return myList.size() > size;
    }    
	   
    
    /**
     * Check if the myList contains a given song
     * @return ...
     */
    public boolean contains(Song song)
    {    
        return  mylist.contains(song);
    }
  
    
    /**
     * Find a song matching a given string
     * @param ...
     * @return ...
     */
    public Song find(String str)
    {
        String s = str.toLowerCase();
        for(Song song : myList)
        {
            if(song.toString().toLowerCase.contains(s))
                  return song;
        }
        return null;
    }
    
	 
    /**
     * Clear the myList
     */
    public void clear()
    {
        myList.clear;
    }
    
	 
    /**
     * Get the size of the myList (= number of songs)
     * @return ...
     */
    public int size()
    {
        return myList.size();
    }
	 
	 
	 /**
     * Get the size of the myList (= number of songs)
     * @return ...
     */
	 public boolean sort()
	 {
	 		return false;
	 }
	 
    
    /**
     * Convert myList to single string with \n after each song
     * @return ...
     */
    public String toString()
    {
        return null;
    }
}
