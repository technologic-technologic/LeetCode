function findMatrix(nums: number[]): number[][] {
    const freq: { [key: number]: number } = {};
    let maxFreq = 0;

    for (const num of nums) {
        freq[num] = (freq[num] || 0) + 1;
        if (freq[num] > maxFreq) {
            maxFreq = freq[num];
        }
    }

    const res: number[][] = [];
    for (let i = 0; i < maxFreq; i++) {
        res.push([]);
    }
    const position: { [key: number]: number } = {};
    for (const num of nums) {
        const row = position[num] ?? 0;
        res[row].push(num);
        position[num] = row + 1;
    }

    return res;
}
