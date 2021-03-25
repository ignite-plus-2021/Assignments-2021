//the initialization portion initializes the loop control variable.
// The condition is a boolean expression that tests the loop control variable.
// The iteration is used to increment or decrement the loop control variable.
//All three initialization, condition and iteration are optional. i.e. we can have for loop without initialization section or condition section or iteration section.
//"Intialization" section is called only once before the for for starts. i.e. No matter how many iterations are there, it is executed only once at the beginning of the for loop. That is why any declarations and intializations, which we do only once goes in this section.
//"Condition" is checked every time before starting the iteration, and only if it is true the body is executed, else the for loop is terminated.
//"Iteration" is called at the end of the body after every iteration. So if there are 5 iterations, the iteration section is executed 5 times.