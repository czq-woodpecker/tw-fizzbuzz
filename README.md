# FizzBuzz

## 需求说明

  你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有120名学生在上课。游戏的规则是： 


1. 让所有学生拍成一队，然后按顺序报数。
2. 学生报数时，如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。 
3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
  
现在，我们需要你完成一个程序来模拟这个游戏，他的输出应该是输出（片段）：

```
1
2
Fizz
4
Buzz
Fizz
Whizz
8
Fizz
Buzz
11
Fizz 
Fizz
Whizz
FizzBuzz
16
17
Fizz
19
Buzz 
… 
一直到120 
```

你只需要实现核心逻辑就可以了。假设最外面已经有一个循环，比如：
 
```
for( int i = 0; i < 120; i++) {
    String result = fizzBuzz(i+1);
    System.out.println(result);
}
```  

你只需要实现里面的fizzBuzz函数，用TDD的方式。


## 已存在代码说明

已经存在的代码主要讲解如何使用测试,我们看到HelloWorldTest下有两个测试,第一个测试演示了如何进行集成测试和使用Assert。
第二个测试演示了如何进行mock。

#tasking
1. should_return_FizzBuzzWhizz_when_input_is_a_multiple_of_3_and_5_and_7
2. should_return_FizzBuzz_when_input_is_a_multiple_of_3_and_5_only
3. should_return_FizzWhizz_when_input_is_a_multiple_of_3_and_7_only
4. should_return_BuzzWhizz_when_input_is_a_multiple_of_5_and_7_only
5. should_return_Fizz_when_input_is_a_multiple_of_3_only
6. should_return_Buzz_when_input_is_a_multiple_of_5_only
7. should_return_Whizz_when_input_is_a_multiple_of_7_only
8. should_return_n_when_input_n_except_above_situations
