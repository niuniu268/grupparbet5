# grupparbet5

## Beskrivning av programmet

Programmet är en telefonbok med CRUD operationerna.
Create   - att lägga till nya profiler i telefonboken
Read     - att söka efter profiler i telefonboken givet olika sökningar
Update  - att kunna uppdatera en profils kontaktuppgifter
Delete   - att kunna ta bort en profil

## Olika användare

Default så är alla användare i systemet en gäst användare, men då inte alla ska kunna ta bort användare så behöver användaren logga in som en administratör för att kunna ta bort individer. Detta gäller även för uppdateringen av en användarens kontaktinformation.
Kontaktinformation
Varje profil i telefonboken ska ha egenskaperna:
förnamn
efternamn
ålder
adress (med stad, postkod, gatunamn, portnummer)
telefonummer (en profil kan ha flera telefonnummer)

## Sökbarhet

Sökning på efternamn - ger profilen som först matchar med sökningen.

Sökning på adress - ger alla profiler på samma gatunamn.

Sökning på förnamn - ger alla profiler med det sökta förnamnet.

Fri sökning - ger alla profiler med någon relaterbar kontaktinformation.

Fri sökning avser att söka över samtliga egenskaper. Exempelvis så kan sökningen Erik ge svar på förnamnet Erik, efternamn Eriksson samt adressen Eriksberg.

## Kravspecifikation

Ett konsolprogram som kan utföra följande operationer:

- Gästanvändare
Förmåga att lägga till kontaktinformation om en profil med egenskaperna beskriva under kontaktinformation.
Förmåga att söka efter profiler givet beskrivningen av sökbarhet.
Förmåga att avsluta programmet genom att skriva “quit” i konsolen.

- Administratör
Förmåga att ta bort kontaktinformation för någon tillagd profil.
Förmåga att uppdatera kontaktinformation för någon tillagd profil.
Samma övriga rättigheter som en gästanvändare.

## Result

We primarily draw a roadmap by which users use this program.

![Logical map](https://github.com/niuniu268/grupparbet5/blob/master/images/logic1.png "logical map")

Moreover, we create a UML graphy. By means of the UML graphy, we can create a couple of classes and methods.

![UML graph](https://github.com/niuniu268/grupparbet5/blob/master/images/uml%20Diagram.drawio.png "UML Graph")

In the end, we have finish this project:

1. When users can this project, they can see the first question as the following picture.

![bild1](https://github.com/niuniu268/grupparbet5/blob/master/images/bild1.png "Bild1")

2. First, users select guest users. They can find that there are two options: add and search.

![bild2](https://github.com/niuniu268/grupparbet5/blob/master/images/bild2.png "Bild2")

3. If users select add function, they should enter first name, last name, age etc in order to add new information. When they finish, they can check the input information for the sake of confirmation.
![bild3](https://github.com/niuniu268/grupparbet5/blob/master/images/bild3.png "Bild3")

4. If user select search, they can find four different ways to search. The first way is the search by address. You may find the result as the following picture.

![bild4](https://github.com/niuniu268/grupparbet5/blob/master/images/bild4.png "Bild4")

5. The following picture is the example of search by first name. As the requirement, users merely can get the first information what users seek.

![bild5](https://github.com/niuniu268/grupparbet5/blob/master/images/bild5.png "Bild5")

6. The following picture is the example of search by last name. Users can get all information what users seek.

![bild6](https://github.com/niuniu268/grupparbet5/blob/master/images/bild6.png "Bild6")

7. This is the free search function. Users can feel free to input anything they want. The project we offer all information which contains waht users search.

![bild7](https://github.com/niuniu268/grupparbet5/blob/master/images/bild7.png "Bild7")

8. Users move on to this administrator part. Prior to applying different function, users should input correct username and password. (This project sets up constant data: "admin" and "12345")

![bild8](https://github.com/niuniu268/grupparbet5/blob/master/images/bild8.png "Bild8")

9. Users can exploit update function in order to update information. Please check the following picture.

![bild9](https://github.com/niuniu268/grupparbet5/blob/master/images/bild9.png "Bild9")

10. Users can also delete information.

![bild10](https://github.com/niuniu268/grupparbet5/blob/master/images/bild10.png "Bild10")

11. Users can updata the database and close the project.

![bild11](https://github.com/niuniu268/grupparbet5/blob/master/images/bild11.png "Bild11")

If you are interested in the mybatis version, please click the following link: https://github.com/niuniu268/database-Mybatis.git