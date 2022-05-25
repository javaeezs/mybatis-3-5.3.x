package com.test.mb;

import com.test.entity.User;
import org.apache.ibatis.scripting.xmltags.ExpressionEvaluator;
import org.junit.Test;

public class OgnlTest {

    @Test
    public void ognlPlay() {
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();

        User user = new User();
        user.setId(1L);
        user.setUserName(null);

        boolean b = expressionEvaluator.evaluateBoolean("id>0 and username!=null", user);
        System.out.println(b);
    }



}
