<script setup>
// 자바스크립트
import SendNameComponent from './components/SendNameComponent.vue';
</script>

<template>
  <div>
    <h1>너의이름은 {{ name }}</h1>
    <SendNameComponent v-on:nameChange="nameChangeHandler" />
  </div>
</template>
<script>
export default {
  name: 'App',
  data() {
    return {
      name: '',
    };
  },
  methods: {
    nameChangeHandler(e) {
      this.name = e.name;
    },
  },
};
</script>
<style lang=""></style>
