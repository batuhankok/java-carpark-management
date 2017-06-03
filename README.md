[![Programming Language](https://img.shields.io/badge/languages-JAVA-green.svg?style=flat)](#)
[![GNU v3 License](https://img.shields.io/badge/license-GNU-yellow.svg?style=flat)](http://choosealicense.com/licenses/gpl-3.0/)
[![Twitter](https://img.shields.io/badge/twitter-@BatuhanKok-blue.svg?style=flat)](http://twitter.com/BatuhanKok)
[![Website](https://img.shields.io/badge/website-batuhan.me-lightgrey.svg?style=flat)](http://batuhan.me)
[![Freelance](https://img.shields.io/badge/hire_me-yes!-brightgreen.svg?style=flat)](http://batuhan.me/contact)

## Java CarPark Project for Software Engineering (CE342)
The project written in Java and we use JFrame for the interface. It also uses MySQL database to save the data which are consist of cars are in the park and some settings of program like admin password, personal password and the hourly price. As I mentioned above, we have written this project for our Software Engineering course's term project at [(Kadir Has University)]. So, it is not an advance programmed but useful and helpful example to use MySQL, JFrame so and so forth for someone who wants and deserves to learn Java.

## Setup and Running
**Important: You have to setup any MySQL program to use it.**
1. In PHPMyAdmin, import the .sql file thats name is `carpark.sql`.
2. Open the project with NetBeans or Eclipse.
3. On the menu of `Run`, select the `compile and run`. 
4. Go to `Project Folder` > `dist`, double click `CarPark.jar`.
5. Thats it!

## Converting Jar File to Executable .app File for MacOS
1. Open `Automator`
2. Create new file
3. Select `Application`
4. On the second panel from the left, click `Run AppleScript`
5. Copy and paste the code below and save it
6. Go to .app file that is created by Automator 
7. Right click, `show package content`
8. Double click the `Contents` file
9. Create new folder as `Java`
10. Copy the project's dist folder to `Java` folder
11. Thats it!

**Code:**
```javascript
on run {input, parameters}
set p to POSIX path of (path to me)
do shell script "java -jar " & p & "/Contents/Java/CarPark.jar"
end run
```

## Screenshots
- [Main Screen]
- [Personal Login Screen]
- [Admin Authorization Screen]
- [Add New Car Screen], [Delete Car Screen], [Show Details Screen]

## Screenshot
![Main](https://github.com/batuhankok/carpark-java/blob/master/screenshots/main.png?raw=true)

## Contributers
- [@ArdaKantarci] 
- [@MustafaKaanAraz]


[Main Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/main.png?raw=true
[Personal Login Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/personal-login.png?raw=true
[Add New Car Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/add-car.png?raw=true
[Delete Car Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/delete-car.png?raw=true
[Show Details Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/show-details.png?raw=true
[Admin Authorization Screen]: https://github.com/batuhankok/carpark-java/blob/master/screenshots/admin-authorization.png?raw=true
[@ArdaKantarci]: https://tr.linkedin.com/in/arda-kantarcı-88481a10b
[@MustafaKaanAraz]: https://twitter.com/kaannaraz
[(Kadir Has University)]: https://twitter.com/khasedutr