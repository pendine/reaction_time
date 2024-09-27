<template>
  <div>
    <button
        :class="buttonClass"
        @click="onClick"
    >
      Click Me
    </button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      buttonClass: 'red', // 초기 색상
      reactionTime: 0,
      testCount: 0,
      startTime: 0,
      results: [],
    };
  },
  methods: {
    startTest() {
      setTimeout(() => {
        this.buttonClass = 'green';
        this.startTime = performance.now();
      }, Math.random() * 10000); // 10초 이내 랜덤 시간
    },
    onClick() {
      if (this.buttonClass === 'green') {
        const endTime = performance.now();
        const reactionTime = endTime - this.startTime;
        this.results.push(reactionTime);
        this.testCount++;

        if (this.testCount < 5) {
          this.buttonClass = 'red';
          this.startTest();
        } else {
          // 결과 전송 로직
        }
      }
    },
  },
  mounted() {
    this.startTest();
  },
};
</script>

<style>
.red {
  background-color: red;
}
.green {
  background-color: green;
}
</style>
