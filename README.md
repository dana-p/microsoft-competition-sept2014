microsoft-competition-sept2014
==============================

Three solutions to problems in the UVic Microsoft Competition 

First problem: 
Print out lines of code that are unreacheable. NEXT goes to next line, GOTO jumpts to line. First line is considered line number 1. 

Example: 

Input
NEXT
GOTO 4
NEXT
NEXT
GOTO 3
NEXT
NEXT
NEXT

Output
6
7
8


Second problem: 
Write if two words are permutations of each other, not including spaces. M and m are considered the same letter.

Example

Input:
"One-Microsoft", "one-Microsoft"
"Aaagmnrs", "anagrams"
"Substitute Focal Awe", "Associate But Flu Wet"
"System" , "System"
"are" , "are"
"composed" , "mostly"
"mostly" , "of"
"the" , "collective"
"collective" , "collective"
"name" , "name"
"for" , "for"

Output
Valid Pattern
Valid Pattern
Valid Pattern
Valid Pattern
Valid Pattern
Invalid Pattern
Invalid Pattern
Invalid Pattern
Valid Pattern
Valid Pattern
Valid Pattern


Third Problem:
Take an email. If the character is not a "regular" character
1. Replace it with "+ INT_LOCATION_IN_STRING UTF8_CODE" 
2. Place the weird characters at the end

Therefore, something like: 
Café@Chaud.tôt
Gets transformed to 
Caf +3 e9 @Chaud.t +12 f4 t éô
+3 = location of é
e9 = UTF8 code for é 
+12 = location of ô
f4 = UTF8 code for ô
aka:
Caf+3e9@Chaud.t+12f4t éô


Example:
NOTE: Some values cannot be displayed here, best viewable in the downloaded input file 

Input: 
WoRlD_ReAdY@Microsoft.COM
Café@Chaud.tôt
Trinitŷ@߷.com
ա@մ.կ
😎@🚀.com
ep@ез.кom
Soup@🍚.com
🆍🆌@SAPA.com
ಠಠ@Look.com
ᱪ@Alien.invasion
Vikingoftheᛗ@North.ᛣ
ဩ@ဦ.com
Ⴭaჯ@Greorgian.letTer

Output: 
WoRlD_ReAdY@Microsoft.COM 
Caf+3e9@Chaud.t+12f4t éô
Trinit+6177@+87f7.com ŷ߷
+0561@+2574.+456f ամկ
+01f60e+1de0e@+31f680+4de80.com 😎🚀
ep@+3435+4437.+643aom езк
Soup@+51f35a+6df5a.com 🍚
+01f18d+1dd8d+21f18c+3dd8c@SAPA.com 🆍🆌
+0ca0+1ca0@Look.com ಠಠ
+01c6a@Alien.invasion ᱪ
Vikingofthe+1116d7@North.+1916e3 ᛗᛣ
+01029@+21026.com ဩဦ
+010cda+210ef@Greorgian.letTer Ⴭჯ
