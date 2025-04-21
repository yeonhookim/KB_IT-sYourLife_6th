import { ref } from 'vue';
import { defineStore } from 'phinia';

export const useMsgStore = defineStore('message', () => {
  const msg = ref('이건 기본 메시지 입니다.');

  function editMsg(newMsg) {
    msg.value = newMsg;
  }
  return { msg, editMsg };
});
