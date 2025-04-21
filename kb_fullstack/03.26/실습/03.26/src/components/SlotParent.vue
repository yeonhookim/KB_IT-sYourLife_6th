<template lang="">
  <div>
    <SlotChild>
      <h1>슬롯 테스트!</h1>
      <img
        src="https://file3.instiz.net/data/file3/2023/02/19/f/2/3/f2342eed1a4e0e0839a2961f824a94bd.jpg"
        alt="amazing spiderman"
      />
    </SlotChild>
  </div>
</template>
<script>
import SlotChild from './SlotChild.vue';
export default {
  name: 'SlotParent',
  components: { SlotChild },
};
</script>
<style lang=""></style>
