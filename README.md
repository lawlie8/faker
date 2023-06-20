Java Faker
==========


This library is a port of Ruby's [faker](https://github.com/stympy/faker) gem (as well as Perl's Data::Faker library) that generates fake data.
It's useful when you're developing a new project and need some pretty data for showcase.

Usage
-----
In pom.xml, add the following xml stanza between `<dependencies> ... </dependencies>`

```xml
<dependency>
    <groupId>com.github.lawlie8</groupId>
    <artifactId>faker</artifactId>
    <version>1.0.3</version>
</dependency>
```

For gradle users, add the following to your build.gradle file.

```groovy
dependencies {
    implementation 'com.github.lawlie8:lawlie8:1.0.3'
}

```

In your Java code

```java
Faker faker = new Faker();

String name = faker.name().fullName(); // Miss Samanta Schmidt
String firstName = faker.name().firstName(); // Emory
String lastName = faker.name().lastName(); // Barton

String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
```


Contributions
-------------
See [CONTRIBUTING.md](https://github.com/lawlie8/faker/blob/master/CONTRIBUTING.md)


Fakers
-----
* Address
* Ancient
* Animal
* App
* Aqua Teen Hunger Force
* Artist
* Avatar
* Back To The Future
* Aviation
* Basketball
* Beer
* Bojack Horseman
* Book
* Bool
* Business
* ChuckNorris
* Cat
* Code
* Coin
* Color
* Commerce
* Company
* Crypto
* DateAndTime
* Demographic
* Disease
* Dog
* DragonBall
* Dune
* Educator
* Esports
* EnglandFootBall
* File
* Finance
* Food
* Friends
* FunnyName
* GameOfThrones
* Gender
* Hacker
* HarryPotter
* Hipster
* HitchhikersGuideToTheGalaxy
* Hobbit
* HowIMetYourMother
* IdNumber
* Internet
* Job
* Kaamelott
* LeagueOfLegends
* Lebowski
* LordOfTheRings
* Lorem
* Matz
* Music
* Name
* Nation
* Number
* Options
* Overwatch
* PhoneNumber
* Photography
* Pokemon
* Princess Bride
* Relationship Terms
* RickAndMorty
* Robin
* RockBand
* Shakespeare
* Sip
* SlackEmoji
* Space
* StarCraft
* StarTrek
* Stock
* Superhero
* Team
* TwinPeaks
* University
* Weather
* Witcher
* Yoda
* Zelda

Usage with Locales
-----

```java
Faker faker = new Faker(new Locale("YOUR_LOCALE"));
```

Supported Locales
-----
* bg
* ca
* ca-CAT
* da-DK
* de
* de-AT
* de-CH
* en
* en-AU
* en-au-ocker
* en-BORK
* en-CA
* en-GB
* en-IND
* en-MS
* en-NEP
* en-NG
* en-NZ
* en-PAK
* en-SG
* en-UG
* en-US
* en-ZA
* es
* es-MX
* fa
* fi-FI
* fr
* he
* hu
* in-ID
* it
* ja
* ko
* nb-NO
* nl
* pl
* pt
* pt-BR
* ru
* sk
* sv
* sv-SE
* tr
* uk
* vi
* zh-CN
* zh-TW

TODO
----
- Port more classes over as there are more entries in the yml file that we don't have classes for

LICENSE
-------
See the LICENSE file for license rights and limitations.
