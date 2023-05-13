import React from "react";
import './Task.scss';
import TaskTable from "./TaskTable";

const Task = () => (
    <div className="container">
        <h1>CRUD App With Hooks</h1>
        <div className="flex-row">
            <div className="flex-large">
                <h2>Add Task</h2>
                <form>
                    <label>Task Name</label>
                    <input type="text" name="taskName" value="" />

                    <label>Task Description</label>
                    <input type="text" name="taskDescription" value="" />

                    <label>Start Date</label>
                    <input type="text" name="startDate" value="" />

                    <label>Finish Date</label>
                    <input type="text" name="finishDate" value="" />
                    <button>Add New Task</button>
                </form>
            </div>
            <div className="flex-large">
                <h2>View Tasks</h2>
                <TaskTable />
            </div>
        </div>
    </div>
)
export default Task;
