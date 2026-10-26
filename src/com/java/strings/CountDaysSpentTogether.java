package com.java.strings;

/*
 *Problem: Count Days Between Two Dates
 * Approach: If the arrival day is after the departure day, return 0.
 *           Otherwise, calculate the inclusive number of days by subtracting
 *           the arrival day from the departure day and adding 1.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class CountDaysSpentTogether {

	public static void main(String[] args) {
		int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String arriveAlice = "08-15";
		String leaveAlice = "08-18";
		String arriveBob = "08-16";
		String leaveBob = "08-19";

		int arriveAliceMonth = Integer.parseInt(arriveAlice.substring(0, 2));
		int arriveAliceDay = Integer.parseInt(arriveAlice.substring(3, 5));

		int leaveAliceMonth = Integer.parseInt(leaveAlice.substring(0, 2));
		int leaveAliceDay = Integer.parseInt(leaveAlice.substring(3, 5));

		int arriveBobMonth = Integer.parseInt(arriveBob.substring(0, 2));
		int arriveBobDay = Integer.parseInt(arriveBob.substring(3, 5));

		int leaveBobMonth = Integer.parseInt(leaveBob.substring(0, 2));
		int leaveBobDay = Integer.parseInt(leaveBob.substring(3, 5));

		int arriveMonth = 0;
		int arriveDay = 0;
		int leaveMonth = 0;
		int leaveDay = 0;

		if (arriveAliceMonth > arriveBobMonth) {
			arriveMonth = arriveAliceMonth;
			arriveDay = arriveAliceDay;
		}

		else if (arriveBobMonth > arriveAliceMonth) {
			arriveMonth = arriveBobMonth;
			arriveDay = arriveBobDay;
		} else {
			arriveMonth = arriveAliceMonth;

			if (arriveAliceDay > arriveBobDay) {
				arriveDay = arriveAliceDay;
			} else {
				arriveDay = arriveBobDay;
			}
		}

		if (leaveAliceMonth < leaveBobMonth) {
			leaveMonth = leaveAliceMonth;
			leaveDay = leaveAliceDay;
		}

		else if (leaveAliceMonth > leaveBobMonth) {
			leaveMonth = leaveBobMonth;
			leaveDay = leaveBobDay;
		} else {
			leaveMonth = leaveAliceMonth;

			if (leaveAliceDay < leaveBobDay) {
				leaveDay = leaveAliceDay;
			} else {
				leaveDay = leaveBobDay;
			}
		}

		int arriveTotal = arriveDay;

		for (int i = 0; i < arriveMonth - 1; i++) {
			arriveTotal += daysInMonths[i];
		}

		int leaveTotal = leaveDay;

		for (int i = 0; i < leaveMonth - 1; i++) {
			leaveTotal += daysInMonths[i];
		}

		if (arriveTotal > leaveTotal) {
			System.out.println(0);
		} else {
			int totalDays = leaveTotal - arriveTotal + 1;
			System.out.println(totalDays);
		}

	}

}
