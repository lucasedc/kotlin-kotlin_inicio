import foo.portaria
import org.junit.Assert
import org.junit.Assume
import org.junit.Test


class MainTest{

    @Test
    fun portariaTest(){


        Assert.assertEquals(portaria(15,"",""),"Negado.")
        Assert.assertEquals(portaria(20,"indeterminado",""),"Negado.")
        Assert.assertEquals(portaria(20,"comum",""),"Negado.")
        Assert.assertEquals(portaria(20,"comum","xt0900"),"Welcome.")
        Assert.assertEquals(portaria(20,"premium","xl"),"Welcome.")
        Assert.assertEquals(portaria(20,"premium","xt0900"),"Negado.")
    }


}