package com.kitiyou.snacks;

import com.kitiyou.snacks.entity.FirstCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HelloTests {

    @Test
    public void testSetterGetter() {
        FirstCategory fc = new FirstCategory();
        fc.setName("nb");
        Assert.assertEquals("nb", fc.getName());
    }

}
