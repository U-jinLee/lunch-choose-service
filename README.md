# lunch-choose-service
오늘 점심 뭐 먹지?
## Build dependencies
- Spring Web
- H2 DB
- Spring Data JPA
- Spring Security
- Mustache
- Lombok
- Swagger
## Kakao API
- 주소로 장소 표시
- infoWindow로 회사 위치 표시
- places로 음식점 정보 callback
- places로 가져온 restaurant marker
## 구현기능
- 회원가입
- 식당 선택하기
  - 사용자는 하루에 한번만 식당을 선택할 수 있다.
  - 처음 선택한 식당의 경우 restaurant table에 식당 정보 업데이트
  - 같은 식당이 선택된 경우 좋아요 count 증가
