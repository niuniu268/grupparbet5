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
