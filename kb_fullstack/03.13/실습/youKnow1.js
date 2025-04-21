function sayMyName() {
  console.log('제 이름은 김연후입니다');
}
function sayMyDinner() {
  console.log('내가 이따 먹을 저녁 메뉴는 삼겹살 입니다');
}

youKnow(sayMyName);
youKnow(sayMyDinner);
youKnow(function () {
  console.log('내일 아침은 계란볶음밥을 먹겠어요.');
});
