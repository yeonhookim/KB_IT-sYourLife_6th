<!-- <template>
  <div>
    <h2>{{ hintMsg }}</h2>
    <input type="number" v-model="inputMsg" placeholder="숫자 입력" />
    <button @click="sendMsg">정답!</button>
  </div>
</template>

<script setup>
import { ref, defineEmits, defineProps } from 'vue';

const inputMsg = ref('');
const hintMsg = ref('');
const emit = defineEmits(['send-msg']);
const props = defineProps(['randomNumber']);

const sendMsg = () => {
  const inputNumber = parseInt(inputMsg.value);

  if (isNaN(inputNumber)) {
    hintMsg.value = '숫자만 입력해주세요!';
    return;
  }

  if (inputNumber === props.randomNumber) {
    hintMsg.value = '정답입니다!';
    emit('send-msg', '');
  } else {
    hintMsg.value = inputNumber < props.randomNumber ? 'UP' : 'DOWN';
    emit('send-msg', '');
  }
};
</script>

<style lang="scss" scoped></style> -->
<template>
  <div>
    <input type="text" v-model.number="userInput" />
    <button @click="sendMsg">정답!</button>
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';

const userInput = ref(0);
const attempt = ref(0);

const props = defineProps({
  randNum: {
    type: Number,
    required: true,
  },
});

const emit = defineEmits(['send-msg']);

const result = computed(function () {
  if (props.randNum > userInput.value) return 'UP';
  if (props.randNum < userInput.value) return 'DOWN';
  return '정답입니다!';
});

const sendMsg = () => {
  attempt.value++;

  emit('send-msg', result.value);
};

watch(attempt, (newValue, oldValue) => {
  if (newValue === 3) return alert('3번째 시도입니다!');
});
</script>

<style lang="scss" scoped></style>
