<script setup>
import CustomInputParent from './components/CustomInputParent.vue';
import TeleportDemo from './components/TeleportDemo.vue';
import ProvideComponent from './components/ProvideComponent.vue';
import RefReactive from './components/composition-api/RefReactive.vue';
import Counter from './components/composition-api/Counter.vue';
import PropsParent from './components/composition-api/PropsParent.vue';
import EmitParent from './components/composition-api/EmitParent.vue';
import QuizParent from './components/composition-api/QuizParent.vue';
</script>

<template>
  <QuizParent />
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {},
};
</script>
<style scoped></style>
<!-- cd C:\kb_fullstack\03.26\실습\03.26\src -->
<!-- npm run dev -->
