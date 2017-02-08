# IPSoftTakeHomeExFinalVersion

Steps to run this test demo:  
Make sure Java 8, Eclipse, Maven Plugin, Firefox 45 is installed and configured properly.  
1.Clone this repository to local  
2.In Eclipse, import this project using "existing projects into workspace"  
3.Dive into "src/main/java/com/ipsoft/yao/takeHomeEx/navigation" directory  
4.Right click "whenVisitingWikipedia.java" file and run as JUnit Test  
You should see TEST START AND TEST PASSED in console.  


Since this is my first time using serenity, I referred to Serenity official website tutorial video and document introduction.  
After reviewing the video, the business logic behind this problem is clear and not very complex.  
1.simulating browser opening wiki homepage.  
2.finding "English" language category.  
3.simulating click on it.  
4.finding the position where welcome words locate.  
5.checking whether it is English.  

The largest challenge I met is that when I run my case, my browser will flash and cannot open a link.  
Usually these 2 exceptions would be thrown:  
Exception: "Could not instantiate class org.openqa.selenium.firefox.FirefoxDriver."  
Exception: "Unable to connect to host 127.0.0.1 on port 7055 after 45000 ms."   

I referred to google and stackoverflow and found this problem may due to version conflicts.  
The final solution for me is to install firefox 45 version. All problems are fixed.  

This take home exercice really taught me a lot,  
I learned start configuring a serenity project using maven.  
I learned some knowledge related to web driver and selenium.  
I learned the lifecycle for a automation test using serenity annotations and seperate into different layers.  

Thanks for reading!!!  
