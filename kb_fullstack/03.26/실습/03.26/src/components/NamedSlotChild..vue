<template>
  <div class="top">
    <h1>여기는 TOP 슬롯, 뭐든지 기울입니다.</h1>
    <slot name="top"></slot>
  </div>
  <div class="bottom">
    <h1>여기는 BOT 슬롯, 뭐든지 밑줄을 칩니다.</h1>
    <slot name="bottom"></slot>
  </div>
</template>
<script>
export default {
  name: 'SlotChild',
};
</script>
<style scoped>
.top {
  font-style: italic;
  background-color: dodgerblue;
}
.bottom {
  text-decoration: underline;
  background-color: yellow;
}
</style>
