<template>
  <div>
    <h1>{{ msg }}</h1>
  </div>
</template>

<script setup>
// import { defineProps } from 'vue';
const props = defineProps({
  msg: {
    type: String,
    required: true,
  },
});

console.log(props.msg);
</script>

<style lang="scss" scoped></style>
