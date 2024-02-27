# Performance Test Comparison: Kafka Producer Performance

## Test Scenarios:

### Performance Test 1:
- **Topic:** performance-test-1
- **Number of Records:** 50,000
- **Record Size:** 1,024 bytes
- **Throughput:** 10,000 records/sec

![performance test 1 results](<images/Screenshot from 2024-02-27 09-50-45.png>)

### Performance Test 2:
- **Topic:** performance-test-2
- **Number of Records:** 500,000
- **Record Size:** 1,024 bytes
- **Throughput:** 10,000 records/sec
![performance test 2 results](<images/Screenshot from 2024-02-27 09-50-54.png>)
## Test Results:

| Test              | Records Sent | Throughput (records/sec) | Avg Latency (ms) | Max Latency (ms) | 50th Percentile (ms) | 95th Percentile (ms) | 99th Percentile (ms) | 99.9th Percentile (ms) |
|-------------------|--------------|--------------------------|-------------------|-------------------|-----------------------|-----------------------|-----------------------|-------------------------|
| Performance Test 1| 50,000       | 9,950.2                  | 347.84            | 879.00            | 350                   | 833                   | 870                   | 878                     |
| Performance Test 2| 500,000      | 9,997.8                  | 7.49              | 616.00            | 1                     | 2                     | 247                   | 339                     |

## Analysis:

- **Number of Records:**
  - Performance Test 2 has 10 times more records (500,000) compared to Performance Test 1 (50,000).

- **Throughput:**
  - Both tests aimed for a throughput of 10,000 records/sec.
  - Performance Test 2 achieved slightly higher throughput (9,997.8 records/sec) compared to Performance Test 1 (9,950.2 records/sec).

- **Latency:**
  - Performance Test 2 demonstrated significantly lower average latency (7.49 ms) compared to Performance Test 1 (347.84 ms).
  - The maximum latency observed in Performance Test 2 was 616 ms, whereas it was 879 ms in Performance Test 1.

- **Percentile Latencies:**
  - Performance Test 2 showed better percentile latencies across all metrics compared to Performance Test 1.
  - Notably, the 99th percentile latency in Performance Test 2 was 247 ms, significantly lower than the 870 ms observed in Performance Test 1.

## Conclusion:

- Performance Test 2, despite handling a larger volume of data, demonstrated superior performance in terms of latency metrics compared to Performance Test 1.
- The higher volume of records in Performance Test 2 did not negatively impact latency, indicating better scalability and efficiency in handling larger workloads.
- For applications requiring high throughput and low latency, optimizing performance based on the insights from Performance Test 2 would be advantageous.
- This comparison highlights the importance of scalability and efficiency in Kafka producer performance, especially when dealing with large volumes of data. By optimizing configurations and resources, organizations can ensure optimal performance for their Kafka-based systems.
