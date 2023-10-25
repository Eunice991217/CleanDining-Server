# CleanDining
여름철 식중독 예방을 위한 식당 소개 서비스입니다. 공공 데이터 포털에서 제공하는 식품 위생업소 현황 데이터를 활용하여 사용자의 위치를 기반으로 위생적인 식당을 쉽게 조회할 수 있습니다.

## 📷 ERD
<p>
<img width="1000” src="https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/ec659178-15f0-4967-ac7b-1cae2b8fb13e">
<img width="1000” src="https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/6da209e7-5c76-4681-89e1-f19a208ab09e">
<img width="1000” src="https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/d72e495c-5816-4d16-8707-dea7a001211a">
<img width="100" src="https://github.com/Eunice991217/CleanDining-Server-ToyProject/assets/101406317/a5410593-91f6-45cd-9b4b-35b016b69d24">
</p>

## 📝 Summary  

- 전체 데이터는 4,491개의 데이터를 가져왔고, 식당 상세 정보 Table인 FoodInfo와 식당의 위치를 저장하는 Table인 LocationInfo로 나누었습니다.
- 식당 상세 정보를 보여주는 Table에는 식당의 이름과 업태명(type)으로 분리되어 있습니다.
- FoodInfo에서 해당 식당에 맞는 위도, 경도, 주소값을 가져와야 했으므로 LocationInfo의 기본키를 외래키로 지정했습니다.

## 🛠️ Tech Stack

 `Spring`  `iOS` `Swift` `Figma`  `Mysql` `Java`
 
