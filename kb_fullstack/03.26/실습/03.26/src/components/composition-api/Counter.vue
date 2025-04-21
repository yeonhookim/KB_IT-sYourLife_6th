<template>
  <div>
    <h1>Vue3 Counter</h1>
    <h1>Count : {{ count }}</h1>
    <h1>두 배로 : {{ double }}</h1>
    <h1>지금까지 계산한 횟수 : {{ calCount }}</h1>
    <button v-on:click="increment">Increment</button>
    <button v-on:click="decrement">Decrement</button>
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
const count = ref(0);
const double = computed(() => count.value * 2);
const calCount = ref(0);

function increment() {
  count.value++;
  calCount.value++;
}
function decrement() {
  count.value--;
  calCount.value++;
}
watch(count, function (newValue, oldValue) {
  console.log(`카운트가 ${oldValue}에서 ${newValue}로 변경되었습니다.`);

  if (newValue % 10 === 0 && newValue !== 0) {
    alert(`축하합니다! ${newValue}까지 도달했습니다!`);
  }
});
</script>

<style lang="scss" scoped></style>
