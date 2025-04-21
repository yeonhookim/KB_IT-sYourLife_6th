<template lang="">
  <div>
    <provideChild :drilling="drilling" />
  </div>
</template>
<script>
import ProvideChild from './ProvideChild.vue';

export default {
  name: 'provideComponent',
  components: { ProvideChild },
  data() {
    return {
      drilling: '어디까지 내려가는 걸까',
    };
  },
  provide() {
    return {
      fly: '후훗',
    };
  },
};
</script>
<style lang=""></style>
