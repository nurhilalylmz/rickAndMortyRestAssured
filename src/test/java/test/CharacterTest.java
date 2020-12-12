package test;

import methods.CharacterMethods;
import org.junit.Assert;
import org.junit.Test;

public class CharacterTest extends CharacterMethods
{
    @Test
    public void controlCharacterName(){
        Assert.assertEquals("Morty Smith",getSpesificCharacter(2).name);
    }
    @Test
    public void controlAllCharacter(){
        Assert.assertEquals("Morty Smith",getAllCharacter().results.get(0).name);
    }

    @Test
    public void searchCharacter(){
       Assert.assertEquals("Morty",searchCharacterWithParameter("Morty","","","","").results.get(0).name);
    }
}
