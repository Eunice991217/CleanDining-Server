# CleanDining
여름철 식중독 예방을 위한 식당 소개 서비스입니다. 공공 데이터 포털에서 제공하는 식품 위생업소 현황 데이터를 활용하여 사용자의 위치를 기반으로 위생적인 식당을 쉽게 조회할 수 있습니다.

## 📷 ERD
![bOu-saQh--0nFw32rMCpQ12lL6zmtEw3oxMlg4gOd1NsREbIQPTiJs7ftqdJu85aVymwiweGzi3qNIGIdtJFbNP2fMdzs4L3fbHTYqfHZ52Sv-czplGSmreeZbP_](https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/2a7bbb9b-ac35-4065-bed0-011980254bea)
![_cWlOUbVVq1PMKxhXjJUeUXz73rZDrA4DsQwW5TYB6NlCdtyW2RvG8KvhiCUAYCJCSwh5SKmxSqlkAUHFFlaGwIAA1l7pTtIaxYjb3AUHZynpE7kHhCXdNId3_HW](https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/406975fd-3b4c-44c4-bb9f-68ca75064316)
![VQX3HSVkJn4wwb59-OS2qsXJKkftyruGF4s9bfoTXi8GszhLstlv-9rXlRRPZi1XPr64HfMCr0hANnZznzkwEWxZdYHF1gQM15I3ScPwdwfkAAsyToQzHJ2anUZ9](https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/e7089122-156c-433f-a5a6-adefd84d0c2b)
![06IIPdqjaaWnKs-GlrYpFiNlHkVwA-x6xcues3zWT_6e3tTZPV9ouzsUIjy-_mu-AtvjIj4J5CpVcdCT9Q_dFQU2P24xiGEHrhvuVu4cgos9LKCWW7NotsFz_8S0](https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/bf410514-fb67-4e21-9bee-d720d5b56077)

## 📝 Summary  

- 전체 데이터는 4,491개의 데이터를 가져왔고, 식당 상세 정보 Table인 FoodInfo와 식당의 위치를 저장하는 Table인 LocationInfo로 나누었습니다.
- 식당 상세 정보를 보여주는 Table에는 식당의 이름과 업태명(type)으로 분리되어 있습니다.
- FoodInfo에서 해당 식당에 맞는 위도, 경도, 주소값을 가져와야 했으므로 LocationInfo의 기본키를 외래키로 지정했습니다.

## 🛠️ Tech Stack

 `Spring`  `iOS` `Swift` `Figma`  `Mysql` `Java`
 
